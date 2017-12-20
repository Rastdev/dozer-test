package com.example.demo.listener;

import com.example.demo.model.MappingAware;
import org.dozer.DozerEventListener;
import org.dozer.event.DozerEvent;

public class JpaCollectionsListener implements DozerEventListener {
    @Override
    public void mappingStarted(DozerEvent event) {
    }

    @Override
    public void preWritingDestinationValue(DozerEvent event) {
    }

    @Override
    public void postWritingDestinationValue(DozerEvent event) {
    }

    @Override
    public void mappingFinished(DozerEvent event) {
        if (event.getDestinationObject() instanceof MappingAware) {
            ((MappingAware)event.getDestinationObject()).finishMapping();
        }
    }
}
