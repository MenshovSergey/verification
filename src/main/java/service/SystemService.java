package service;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.util.function.Function;


@Slf4j
public class SystemService {
    public <T> T executeForRead(String[] command, Function<InputStream, T> consumer) {
        Process process;
        try {
            process = Runtime.getRuntime().exec(command);
            try {
                T t = consumer.apply(process.getInputStream());
                process.waitFor();
                return t;
            } catch (InterruptedException e) {
                e.printStackTrace();
                log.error(e.getLocalizedMessage(), e);
            }
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            log.error(e.getLocalizedMessage(), e);
        }
        return null;
    }
}
