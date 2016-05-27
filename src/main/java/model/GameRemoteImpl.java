package model;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import VO.*;
import control.DownSnakeOperation;
import control.LeftSnakeOperation;
import control.RightOperation;
import control.UpSnakeOperation;

/**
 * Created by chenh on 2016/5/27.
 */
public class GameRemoteImpl extends UnicastRemoteObject implements GameRemote{
    GameModelService gameModelService;

    public GameRemoteImpl() throws RemoteException {
        super();
        gameModelService=GameModelFactory.getGameModelService();
    }

    @Override
    public boolean nowDie() throws RemoteException{
        return true;
    }

    @Override
    public ArrayList<Snake> getSnake() throws RemoteException{
        return gameModelService.getSnake();
    }

    @Override
    public ArrayList<Block> getBlock() throws RemoteException{
        return gameModelService.getBlock();
    }

    @Override
    public void turnLeft() throws RemoteException{
        new LeftSnakeOperation();
    }

    @Override
    public void turnRight() throws RemoteException{
        new RightOperation();
    }

    @Override
    public void turnUp() throws RemoteException{
        new UpSnakeOperation();
    }

    @Override
    public void turnDown() throws RemoteException{
        new DownSnakeOperation();
    }


    @Override
    public void start() throws RemoteException{
        gameModelService.start();
    }

    @Override
    public boolean canStartNow()throws RemoteException {
        return true;
    }
}
