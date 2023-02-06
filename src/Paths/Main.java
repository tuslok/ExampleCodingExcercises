package Paths;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        /*Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
        printFile(path);
        //Path filePath = FileSystems.getDefault().getPath("files", "SubDirectioryFile.txt");
        Path filePath = Paths.get(".", "files", "SubDirectioryFile.txt");
        printFile(filePath);
        //filePath = Paths.get("C:\\Users\\a887602\\IdeaProjects\\ExampleCodingExcercices\\src\\OutThere.txt");
        printFile(filePath);

        filePath = Paths.get(".");
        System.out.println(filePath.toAbsolutePath());

        Path path2 = FileSystems.getDefault().getPath(".", "files", "..", "files", "SubDirectioryFile.txt");
        System.out.println(path2.normalize().toAbsolutePath());
        printFile(path2.normalize());*/

        /*try {

            Path filePath = FileSystems.getDefault().getPath("src", "Paths", "Dir1/RandomFile.txt");
            long size = Files.size(filePath);
            System.out.println("Size = " + size);
            System.out.println("Last modified = " + Files.getLastModifiedTime(filePath));

            BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Size = " + attrs.size());
            System.out.println(("Last modified = " + attrs.lastModifiedTime()));
            System.out.println(("Created = " + attrs.creationTime()));
            System.out.println(("Is directory = " + attrs.isDirectory()));
            System.out.println(("Is regular file = " + attrs.isRegularFile()));




            *//*Path fileTocreate = FileSystems.getDefault().getPath("file22.txt");
            Files.createFile(fileTocreate);*//*
         *//*Path DirToCreate = FileSystems.getDefault().getPath("src","Paths","Dir7");
            Files.createDirectory(DirToCreate);*//*

         *//*Path dirToCreate = FileSystems.getDefault().getPath("src", "Paths", "Dir7\\Dir4\\Dir6");
            Files.createDirectories(dirToCreate);*//*

         *//*Path fileToRemove = FileSystems.getDefault().getPath("src", "Paths", "Dir2", "rand22222.txt");
            Files.deleteIfExists(fileToRemove);*//*

         *//*Path fileToMove = FileSystems.getDefault().getPath("src","Paths", "Dir1", "rand.txt");
            Path destination = FileSystems.getDefault().getPath("src","Paths", "Dir2", "rand22222.txt");
            Files.move(fileToMove, destination);*//*

         *//*Path sourceFile = FileSystems.getDefault().getPath("files", "SubDirectioryFile.txt");
            Path copyFile = FileSystems.getDefault().getPath("files", "filecopy1.txt");
            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);

            sourceFile = FileSystems.getDefault().getPath("src\\Paths", "Dir1");
            copyFile = FileSystems.getDefault().getPath("files", "Dir1");
            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);*//*
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }*/

        /*DirectoryStream.Filter<Path> filter =
                new DirectoryStream.Filter<Path>() {
                    @Override
                    public boolean accept(Path path) throws IOException {
                        return (Files.isRegularFile(path));
                    }
                };*/

        DirectoryStream.Filter<Path> filter = p -> Files.isRegularFile(p);
        Path directory = FileSystems.getDefault().
                getPath("src" + File.separator + "Paths" + File.separator + "Dir7" + File.separator + "Dir4");
        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)) {
            for (Path file : contents) {
                System.out.println(file.getFileName());
            }
        } catch (IOException | DirectoryIteratorException e) {
            System.out.println(e.getMessage());
        }

        String separator = File.separator;
        System.out.println(separator);
        separator = FileSystems.getDefault().getSeparator();
        System.out.println(separator);

        try {
            Path tempFile = Files.createTempFile("myApp", ".appext");
            // C:\Users\a887602\AppData\Local\Temp\myApp608241609416319195.appext
            System.out.println("Temporary file path " + tempFile.toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
        for (FileStore store : stores) {
            System.out.println("Volume name/Drive letter " + store);
            System.out.println("file store = " + store.name());
        }

        Iterable<Path> rootPaths = FileSystems.getDefault().getRootDirectories();
        for (Path path : rootPaths) {
            System.out.println(path);
        }

        System.out.println("--- Walking Tree for Dir4 ----");
        Path dir2Path = FileSystems.getDefault().
                getPath("src" + File.separator + "Paths");
        try {
            Files.walkFileTree(dir2Path, new PrintName());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--- Copy DirX to DirX ---");
        Path copPath = FileSystems.getDefault().getPath("src" + File.separator + "Paths" + File.separator + "Dir7" + File.separator + "Dir4Copy");
        try {
            Files.walkFileTree(dir2Path, new CopyFiles(dir2Path, copPath));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printFile(Path path) {
        try (BufferedReader FileReader = Files.newBufferedReader(path)) {
            String line;
            while ((line = FileReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
