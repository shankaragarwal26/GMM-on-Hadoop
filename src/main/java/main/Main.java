package main;

import parallel.gmm.MapRedGMM;

/**
 * Created by shankaragarwal on 03/11/17.
 */
public class Main {

    public static void main(String[] args){
        MapRedGMM mapRedGMM = new MapRedGMM();
        try {
            mapRedGMM.startMapReduce(args[0],args[1]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
