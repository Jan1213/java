import java.util.HashMap;
import java.util.Map;

public class Recorder{
    private Map<String, String> map = new HashMap<>();
//key,value�̓o�^
    public void put(String key, String value){
        map.put(key,value);
        System.out.println(key + "=" + value);
    }
//�w�肳�ꂽ�L�[�ܖ��o�^�̏ꍇ�AIllegalArgumentException���X���[����
    public void get(String key){
        if(!map.containsKey(key)){
            throw new IllegalArgumentException();
        }
        System.out.println(map.get(key));
    }
//key���o�^�ς݂̏ꍇ�A�Ή����� key��value�̑g�ݍ��킹���폜����
    public void delete(String key){
        if(!map.containsKey(key)){
            throw new IllegalArgumentException();
        }

        map.remove(key);
        System.out.println("deleted:" + key);
    }
//�������Ȃ������ꍇ�S�ẴL�[�ƃo�����[�̒l���폜����
    public void delete(){
        map.clear();
        System.out.println("deleted all");
    }
}