/*
 *
 * Author : fcbruce <fcbruce8964@gmail.com>
 *
 * Time : Wed 24 Jan 2018 21:53:14
 *
 */

package com.yqg.path;

import java.util.*;
import java.math.*;
import java.io.*;
import java.net.URI;
import java.nio.file.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;


public class PathChecker {
  public static void main(String[] args) {
    try {
      URI uri = PathChecker.class.getClassLoader().getResource("file.txt").toURI();
      System.out.println(uri.toString());
      FileSystems.newFileSystem(uri, Collections.emptyMap());
      Path path = Paths.get(uri);
      BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8);
      System.out.println(br.readLine());
      br.close();
    } catch (Exception e) {
      System.err.println(e);
    }

    
    
  }
}
