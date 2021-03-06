package com.xxmicloxx.NoteBlockAPI;

import org.spongepowered.api.event.cause.Cause;
import org.spongepowered.api.event.impl.AbstractEvent;

public class SongStoppedEvent extends AbstractEvent {

    private final SongPlayer song;
    private final Cause cause;

    public SongStoppedEvent(SongPlayer song, Cause cause) {
        this.song = song;
        this.cause = cause;
    }

    public SongPlayer getSongPlayer() {
        return song;
    }

    @Override
    public Cause getCause() {
        return cause;
    }
}
