import java.util.HashMap;
import java.util.Map;

public class Recorder{
    private Map<String, String> map = new HashMap<>();
//key,valueの登録
    public void put(String key, String value){
        map.put(key,value);
        System.out.println(key + "=" + value);
    }
//指定されたキーま未登録の場合、IllegalArgumentExceptionをスローする
    public void get(String key){
        if(!map.containsKey(key)){
            throw new IllegalArgumentException();
        }
        System.out.println(map.get(key));
    }
//keyが登録済みの場合、対応する keyとvalueの組み合わせを削除する
    public void delete(String key){
        if(!map.containsKey(key)){
            throw new IllegalArgumentException();
        }

        map.remove(key);
        System.out.println("deleted:" + key);
    }
//引数がなかった場合全てのキーとバリューの値を削除する
    public void delete(){
        map.clear();
        System.out.println("deleted all");
    }
}