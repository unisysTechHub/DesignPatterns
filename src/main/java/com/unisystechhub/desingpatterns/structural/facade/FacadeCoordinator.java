package com.unisystechhub.desingpatterns.structural.facade;

import java.util.List;

/** Presents one simple operation while coordinating the subsystem steps. */
public class FacadeCoordinator {
    private final MediaPlayer player;
    private final Projector projector;
    private final StreamingService streamingService;

    public FacadeCoordinator() {
        this(new MediaPlayer(), new Projector(), new StreamingService());
    }

    public FacadeCoordinator(MediaPlayer player, Projector projector, StreamingService streamingService) {
        this.player = player;
        this.projector = projector;
        this.streamingService = streamingService;
    }

    public List<String> watchMovie(String title) {
        projector.on();
        streamingService.select(title);
        player.play(title);
        return List.of("projector on", "selected " + title, "playing " + title);
    }
}
