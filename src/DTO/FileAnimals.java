/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class FileAnimals {
    final static String filePath = "D:\\CN2\\PRO192\\JAVA\\ZooManager\\Animals.txt";
    static private File file = new File(filePath);;

    public FileAnimals() {
       
    }
    
//    public static ArrayList<Animals> openFile(String filename)
//    {
//        FileReader f=null;
//        BufferedReader bf= null;
//        ArrayList <Animals> kq=new ArrayList<>();
//        try {
//            f= new FileReader(filename);
//            bf= new BufferedReader(f);
//            while(bf.ready()){
//            String s=bf.readLine();
//            //cat s thanh 3 phan dua vao @
//            String[] tmp=s.split(" ");//tmp=["p1","quan lot","10000"]
//            if(tmp.length==5)
//            {
//                Animals x=new Animals(tmp[0], tmp[1], tmp[2], tmp[3],tmp[4] tmp Integer.parseInt(tmp[4]));
//                kq.add(x);//can co ham compeare to de so sanh hai san pham
//            }
//           }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        finally{
//            try {
//                if(f!=null) f.close();
//                if(bf!=null) bf.close();//đe go hai dai chi ra de khong dinh liu vs nhau
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//        return kq;
//    } 
//    
    
    // vo ko nhap mấy cái fiel nó lấy thông tin củ cái đó xử lí sao m
 //m doc nguyen 1 cai file ra 1 lít roi tim 1 doi tuong co cai id la cai m muon update xong sau do m cap nhat lai thong tin
    //roi ghi het lai cai file de len cai file cu~
    // để tao chay cho
    
    
    public static void writeFile(ArrayList<Animals> list)
    {   
        if( list.size()!=0){
            PrintWriter w=null;
            try {
                w=new PrintWriter(file);
                for(Animals p:list){
                    w.print(p.getId()+"-"+p.getName()+"-"+p.getGender()+"-"+p.getWeight()+"-");
                    w.println( p.getType()+"-"+p.getNumberleg()+"-"+p.getPoisonous()+"-"+p.getMakesound()+"-"+p.getHeroic()+"-"+p.getDanger());
                    w.flush();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            finally{
                try {
                    if(w!=null) w.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        
    }
    public static void main(String[] args) {
        ArrayList<Animals> list = new ArrayList<>();
        Animals a = new Animals("1","ran", "den","x", 5, "0-legged animals","0-leg", true, false, false, false, false);
        list.add(a);
        writeFile(list);
    }
}
