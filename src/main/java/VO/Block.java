package VO;

import java.io.Serializable;

/**
 * Created by chenh on 2016/5/23.
 */
public class Block implements Serializable {
    public int i;
    public int j;

    public Block(int i, int j){
        this.i=i;
        this.j=j;
    }
}
