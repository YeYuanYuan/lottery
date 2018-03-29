


package connections;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Map;

public class Test {

    public static final String TB_NAME1 = "tb_table1";

    public static final String TB_NAME2 = "tb_table2";


    @ATest
    public static final String TB_NAME3 = "tb_table3";


    public static void main(String[] args) throws Exception {

//        Field[] fields = Test.class.getDeclaredFields();
//        for (Field field : fields) {
////            field.setAccessible(true);
////            String name = (String) f;
//
//            Annotation[] annotation = field.getAnnotations();
//
//            for (Annotation annotation1 : annotation) {
//                if (annotation1 instanceof ATest) {
//
//
//                    System.out.println(field.getName() + " = " + field.get(null));
//                }
//            }
//        }
        System.out.println(Test.class.getDeclaredField("TB_NAME1").get(null));

//        Field[] fields=Test.class.getDeclaredFields();
//        for(Field field:fields){
//            String descriptor= Modifier.toString(field.getModifiers());//获得其属性的修饰
////            descriptor=descriptor.equals("")==true?"":descriptor+" ";
//            System.out.println(descriptor+field.getName()+"="+field.get(null));
//        }

    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    private @interface ATest {

    }

}
