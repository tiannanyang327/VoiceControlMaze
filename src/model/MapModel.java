package model;

import javafx.scene.layout.Pane;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MapModel extends Pane {

    public List<String> list = new ArrayList<>();
    public int[][] map = null;

//    @Test
//    public void testResults(String mapName) throws IOException {
//        int[][] result = readMap(mapName);
//        for(int i=0; i < result.length; i++){
//            for (int j=0; j < result[i].length; j++){
//                System.out.print(result[i][j]+" ");
//            }
//            System.out.println();
//
//        }
//    }

    public int[][] readMap(String mapName) throws IOException {
        FileInputStream fis = new FileInputStream(mapName);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        //value is the number of rows
        String rowValue = br.readLine();


        while(rowValue != null){
            list.add(rowValue);
            rowValue = br.readLine();

        }
        br.close();


        int row = list.size();
        int column = 0;

        for (int i = 0; i < 1; i++){
            String str = list.get(i);
            String[] columnValue = str.split(",");

            column = columnValue.length;
        }

        map = new int[row][column];

        for(int i = 0; i < row; i++){
            //the values of a row
            String str = list.get(i);
            //the value of a column
            String[] values = str.split(",");
            for (int j=0; j < values.length; j++){
                map[i][j] = Integer.parseInt(values[j]);
            }
        }
        return map;
    }
//    public int[][] getMap(){
//        return this.map;
//    }
}
//Reference:
