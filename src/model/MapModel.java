package model;

import javafx.scene.layout.Pane;

import java.io.BufferedReader;
import java.io.FileReader;

public class MapModel extends Pane {
    public static int rows = 20;
    public static int columns = 20;
    public static int boxSize = 40;

    public static int map[][] = new int [columns][rows];
    public String filename;

    public MapModel(String filename) {
        this.filename = filename;
        loadMap(filename);
    }
    public void loadMap(String filename){
        try{
            BufferedReader br = new BufferedReader(new FileReader(filename));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();

            }
            String mapStr = sb.toString();

            int counter = 0;
            for(int y = 0; y < columns; y++){
                for(int x = 0; x < rows; x++){
                    String mapChar = mapStr.substring(counter, counter+1);
                    if(!mapChar.equals("\r\n") && !mapChar.equals("\n")&& !mapChar.equals("\r")){//If it's a number
//                        System.out.print(mapChar);
                        map[x][y] = Integer.parseInt(mapChar);
                    }else{//If it is a line break
                        x--;//
                        System.out.print(mapChar);
                    }
                    counter++;
                }
            }
        }catch(Exception e){
            System.out.println("Unable to load existing map(if exists), creating new map.");
        }
    }
    public int[][] getMap() {
        return this.map;
    }
}
