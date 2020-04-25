package com.javarush.task.task31.task3111;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.FileVisitResult.CONTINUE;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private String partOfName;
    private String partOfContent;
    private int minSize;
    private int maxSize;
    private  List<Path> foundFiles = new ArrayList<>();

    boolean minSizeCheck;
    boolean maxSizeCheck;
    boolean partOfNameCheck;
    boolean partOfContentCheck;

    public SearchFileVisitor() {
        this.partOfName = null;
        this.partOfContent = null;
        this.minSize = 0;
        this.maxSize = 0;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        byte[] content = Files.readAllBytes(file); // размер файла: content.length
        String strCont = new String(content);
        int size = content.length;


        if (!attrs.isRegularFile()) return CONTINUE;

        if (partOfNameCheck && file.getFileName().toString().indexOf(this.partOfName) == -1)
            return CONTINUE;

        if (minSizeCheck && attrs.size() < minSize)
            return CONTINUE;

        if (maxSizeCheck && attrs.size() > maxSize)
            return CONTINUE;

        if (partOfContentCheck && new String(Files.readAllBytes(file)).indexOf(partOfContent) == -1)
            return CONTINUE;

        foundFiles.add(file);

        return CONTINUE;

  /*       if (partOfName == null && partOfContent == null && minSize == 0 && maxSize != 0 )                              // 0 0 0 1
            if (size < maxSize) foundFiles.add(file.getFileName());
         else if (partOfName == null && partOfContent == null && minSize != 0 && maxSize == 0 )                         // 0 0 1 0
            if (size > minSize) foundFiles.add(file.getFileName());
         else if (partOfName == null && partOfContent == null && minSize != 0 && maxSize != 0)                          // 0 0 1 1
            if (size > minSize && size < maxSize) foundFiles.add(file.getFileName() );

         else if (partOfName == null && partOfContent != null && minSize == 0 && maxSize == 0 )                         // 0 1 0 0
            if (strCont.contains(partOfContent)) foundFiles.add(file.getFileName());
         else if (partOfName == null && partOfContent != null && minSize == 0 && maxSize != 0)                          // 0 1 0 1
            if (strCont.contains(partOfContent) && size < maxSize) foundFiles.add(file.getFileName() );
         else if (partOfName == null && partOfContent != null && minSize != 0 && maxSize == 0)                          // 0 1 1 0
            if (strCont.contains(partOfContent) && size > minSize) foundFiles.add(file.getFileName() );
         else if (partOfName == null && partOfContent != null && minSize != 0 && maxSize != 0)                          // 0 1 1 1
            if (strCont.contains(partOfContent) && size > minSize && size < maxSize) foundFiles.add(file.getFileName());

         else if (partOfName != null && partOfContent == null && minSize == 0 && maxSize == 0)                          // 1 0 0 0
            if (file.getFileName().toString().contains(partOfName)) foundFiles.add(file.getFileName());
         else if (partOfName != null && partOfContent == null && minSize == 0 && maxSize != 0)                          // 1 0 0 1
            if (file.getFileName().toString().contains(partOfName) && size < maxSize) foundFiles.add(file.getFileName());
         else if (partOfName != null && partOfContent == null && minSize != 0 && maxSize == 0)                          // 1 0 1 0
            if (file.getFileName().toString().contains(partOfName) && size > minSize) foundFiles.add(file.getFileName());
         else if (partOfName != null && partOfContent == null && minSize != 0 && maxSize != 0)                          // 1 0 1 1
            if (file.getFileName().toString().contains(partOfName) && size > minSize && size < maxSize) foundFiles.add(file.getFileName());

         else if (partOfName != null && partOfContent != null && minSize == 0 && maxSize == 0 )                          // 1 1 0 0
            if (file.getFileName().toString().contains(partOfName) && strCont.contains(partOfContent)) foundFiles.add(file.getFileName());
         else if (partOfName != null && partOfContent != null && minSize == 0 && maxSize != 0 )                          // 1 1 0 1
            if (file.getFileName().toString().contains(partOfName) && strCont.contains(partOfContent) && size < maxSize) foundFiles.add(file.getFileName());
         else if (partOfName != null && partOfContent != null && minSize != 0 && maxSize == 0)                           // 1 1 1 0
            if (file.getFileName().toString().contains(partOfName) && strCont.contains(partOfContent) && size > minSize) foundFiles.add(file.getFileName() );
         else if (partOfName != null && partOfContent != null && minSize != 0 && maxSize != 0)                           // 1 1 1 1
            if (file.getFileName().toString().contains(partOfName) && strCont.contains(partOfContent) && size > minSize && size < maxSize) foundFiles.add(file.getFileName() );



        return FileVisitResult.CONTINUE;*/

//        return super.visitFile(file, attrs);
    }


    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
        this.partOfNameCheck = true;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
        this.partOfContentCheck = true;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
        this.minSizeCheck = true;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
        this.maxSizeCheck = true;
    }

    public List<Path> getFoundFiles() { return this.foundFiles; }
}
