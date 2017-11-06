package com.aoss.bossmvp.model;

import java.util.List;

/**
 * Created by YoBo on 2017/11/6.
 */

public interface IGirlModel {

    void loadGirls(GirlsLoadListener listener);

    interface GirlsLoadListener {

        void onComplete(List<String> girls);

    }


}
