
package connections;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

@Deprecated
public class connectDS {

    public static void main(String[] args) {

        FileChannel channel = null;

        try {
            RandomAccessFile aFile = new RandomAccessFile(
                    "F:\\elicpse_project\\lottery\\test_intellij\\src\\connections\\connectDS.java","rw");
            channel = aFile.getChannel();
            ByteBuffer buffer = ByteBuffer.wrap(new byte[1024]);
            int leng = channel.read(buffer);
            while (leng != -1 && leng != 0) {
//                System.out.println(" read buffer : " + leng);
                buffer.flip();
                while (buffer.hasRemaining()) {
                    System.out.println(new String(buffer.array()));
                    buffer.clear();
                    buffer.position(buffer.limit());

                }
                leng = channel.read(buffer);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
