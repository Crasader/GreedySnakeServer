package model;

/**
 * Created by chenh on 2016/5/27.
 */
public class GameModelFactory {

    private static GameModelService gameModelService;


    public static GameModelService getGameModelService(){
        if (gameModelService==null){
            gameModelService=new GameModelImpl();
        }
        return gameModelService;
    }


    /*public static void netModel(){
        gameModelService=new GameModelImpl();
        gameModelService.start();
    }*/
}
