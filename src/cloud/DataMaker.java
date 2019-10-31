package cloud;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 数据生成器，用来生成新数据并进行归一化处理
 */
public class DataMaker {
    private String path;    //文本文件的地址
    private static List<String> data;

    public DataMaker(){ //在构造数据生成器时便读取数据
        try {
            readText();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取文本文档中的内容，添加到data中
     * @throws Exception
     */
    public void readText() throws Exception {
        path = "d:\\d2d\\cloud\\data.txt";
        List<String> list = new ArrayList<String>();
        FileInputStream fis = new FileInputStream(path);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        String line = "";
        while ((line = br.readLine()) != null) {
                list.add(line);
        }
        br.close();
        isr.close();
        fis.close();
        data = list;
    }
    public String readLine(){
        if(data.isEmpty()){
            return null;
        }else{
            String a = data.get(0);
            data.remove(0);
            return a;
        }
    }
}
