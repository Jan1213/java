```java.Recorder.java
importjava.util.HashMap;
importjava.util.Map;

public class Recorder{
    private Map<strig,string>mp = new HashMap<>();

    public void put(String key,String value){
        map.put(key,value);
        System.out.println(key + "=" + value);
    }

    public void get(String Key){
        if(!map.containskey(key)){
            thorow new
            lllegalArgumentException();
        }
        System.out.println(map.get(key));
    }

    public void delete(String key){
        if(!map.containskey(key)){
            throw new
            lllegalArgumentException();
        }

        map.remove(key);
        System.out.println("deleted:" + key);
    }

    public void delete(){
        map.clear();
        System.out.println("deleted all");
    }
}