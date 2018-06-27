/**
 * Copyright (C), 2015-2018, 中商惠民科技有限公司
 * FileName: Pipe
 * FileName: Pipe
 * Author:   Eilen
 * Date:     2018/6/27 17:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.start.springbootstart.demo.nio;

import javax.xml.transform.sax.SAXSource;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

/**
 * 〈describe〉<br> 
 * 〈管道〉
 *
 * @author Eilen
 * @create 2018/6/27
 * @since 1.0.0
 */
public class PipeDemo {
    public static void main(String[] args) throws IOException {
        Pipe pipe = Pipe.open();
        ByteBuffer buf = ByteBuffer.allocate(1024);
        Pipe.SinkChannel sink = pipe.sink();
        buf.put("ahdfaldfdfafd单向数据开始发送了".getBytes());
        buf.flip();
        sink.write(buf);

        Pipe.SourceChannel source = pipe.source();
        buf.flip();
        int read = source.read(buf);
        System.out.println(new String(buf.array(),0,read));
        sink.close();
        source.close();
    }
}
