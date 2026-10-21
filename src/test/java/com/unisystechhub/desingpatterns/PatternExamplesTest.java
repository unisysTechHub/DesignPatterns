package com.unisystechhub.desingpatterns;

import com.unisystechhub.desingpatterns.behavioural.TemplateMethod.PaymentRepo;
import com.unisystechhub.desingpatterns.behavioural.iterator.NameIterator;
import com.unisystechhub.desingpatterns.behavioural.strategy.Addition;
import com.unisystechhub.desingpatterns.behavioural.strategy.OperationManager;
import com.unisystechhub.desingpatterns.behavioural.strategy.Substraction;
import com.unisystechhub.desingpatterns.behavioural.vistor.Circle;
import com.unisystechhub.desingpatterns.behavioural.vistor.Rectangle;
import com.unisystechhub.desingpatterns.behavioural.vistor.ShapeDrawer;
import com.unisystechhub.desingpatterns.creational.builder.Person;
import com.unisystechhub.desingpatterns.creational.AbstractFacotory.AbstractFactory;
import com.unisystechhub.desingpatterns.creational.AbstractFacotory.FactoryType;
import com.unisystechhub.desingpatterns.creational.AbstractFacotory.FacotryProducer;
import com.unisystechhub.desingpatterns.creational.prototype.LoanApplication;
import com.unisystechhub.desingpatterns.creational.prototype.LoanType;
import com.unisystechhub.desingpatterns.structural.bridge.RasterRender;
import com.unisystechhub.desingpatterns.structural.bridge.SquareRosterRenderer;
import com.unisystechhub.desingpatterns.structural.bridge.VectorRender;
import com.unisystechhub.desingpatterns.structural.composite.FileComponent;
import com.unisystechhub.desingpatterns.structural.composite.Folder;
import com.unisystechhub.desingpatterns.structural.decorate.MilkDecorator;
import com.unisystechhub.desingpatterns.structural.decorate.PlainBeverage;
import com.unisystechhub.desingpatterns.structural.facade.FacadeCoordinator;
import com.unisystechhub.desingpatterns.structural.flyweight.BulletType;
import com.unisystechhub.desingpatterns.structural.flyweight.Flyweight;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PatternExamplesTest {
    @Test
    void builderProducesValidatedImmutableConfiguration() {
        Person person = new Person.Builder().firstName("Ada").lastName("Lovelace").age(36).build();
        assertEquals("Ada", person.getFirstName());
        assertEquals(36, person.getAge());
        assertThrows(IllegalStateException.class, () -> new Person.Builder().build());
    }

    @Test
    void prototypeCopiesMutableState() {
        LoanApplication original = new LoanApplication(12, LoanType.Home, new ArrayList<>(List.of("id")));
        LoanApplication copy = original.clone();
        copy.getDocumetns().add("income-proof");
        assertEquals(List.of("id"), original.getDocumetns());
        assertEquals(List.of("id", "income-proof"), copy.getDocumetns());
    }

    @Test
    void abstractFactoryCreatesACompatibleProductFamily() {
        AbstractFactory factory = FacotryProducer.getFactory(FactoryType.Electric);
        assertEquals("Electric", factory.getCar("Ford").getType());
        assertEquals("Battery", factory.getPowerSource().type());
    }

    @Test
    void decoratorAddsBehaviorWithoutChangingTheComponentType() {
        MilkDecorator coffeeWithMilk = new MilkDecorator(new PlainBeverage());
        assertEquals(7, coffeeWithMilk.getCost());
        assertEquals("Plain beverage, milk", coffeeWithMilk.descripiotn());
    }

    @Test
    void strategyCanBeChangedAtRuntime() {
        OperationManager manager = new OperationManager(new Addition());
        assertEquals(7, manager.perform(3, 4));
        manager.setStrategy(new Substraction());
        assertEquals(-1, manager.perform(3, 4));
    }

    @Test
    void iteratorReportsExhaustionInsteadOfReturningNull() {
        NameIterator iterator = new NameIterator("Ada");
        assertEquals("Ada", iterator.next());
        assertThrows(java.util.NoSuchElementException.class, iterator::next);
    }

    @Test
    void templateMethodKeepsTheWorkflowAndVariesDetails() {
        assertEquals("Sent payment request to https://payments.example/upi with 1 headers",
                new PaymentRepo().upiPayment());
    }

    @Test
    void visitorUsesDoubleDispatchForDifferentElements() {
        ShapeDrawer drawer = new ShapeDrawer();
        new Circle(2).accept(drawer);
        new Rectangle(3, 4).accept(drawer);
        assertEquals(List.of("circle:2.0", "rectangle:3.0x4.0"), drawer.getDrawnShapes());
    }

    @Test
    void bridgeVariesRendererIndependentlyFromShape() {
        assertTrue(new SquareRosterRenderer(new VectorRender()).draw().contains("vectors"));
        assertTrue(new SquareRosterRenderer(new RasterRender()).draw().contains("pixels"));
    }

    @Test
    void compositeTreatsFoldersAndFilesUniformly() {
        Folder folder = new Folder();
        folder.addFile(new FileComponent("readme", 5));
        Folder child = new Folder();
        child.addFile(new FileComponent("image", 15));
        folder.addFile(child);
        assertEquals(20, folder.getSize());
    }

    @Test
    void facadeCoordinatesTheSubsystems() {
        assertEquals(List.of("projector on", "selected Arrival", "playing Arrival"),
                new FacadeCoordinator().watchMovie("Arrival"));
    }

    @Test
    void flyweightSharesIntrinsicBulletType() {
        BulletType first = Flyweight.getBulletType("metal", 10, 2);
        BulletType second = Flyweight.getBulletType("metal", 10, 2);
        assertSame(first, second);
    }
}
