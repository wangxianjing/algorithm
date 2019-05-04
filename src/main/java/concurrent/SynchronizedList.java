package main.java.concurrent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by wong on 2019/5/2.
 */
public class SynchronizedList {
    List<String> list = Collections.synchronizedList(new ArrayList<>());
}
