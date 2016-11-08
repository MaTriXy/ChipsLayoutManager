package com.beloo.widget.chipslayoutmanager.layouter.placer;

import android.support.v7.widget.RecyclerView;

public class DisappearingPlacerFactory implements IPlacerFactory {

    private RecyclerView.LayoutManager layoutManager;

    public DisappearingPlacerFactory(RecyclerView.LayoutManager layoutManager) {
        this.layoutManager = layoutManager;
    }

    @Override
    public IPlacer getAtStartPlacer() {
        return new DisappearingViewAtStartPlacer(layoutManager);
    }

    @Override
    public IPlacer getAtEndPlacer() {
        return new DisappearingViewAtEndPlacer(layoutManager);
    }
}
