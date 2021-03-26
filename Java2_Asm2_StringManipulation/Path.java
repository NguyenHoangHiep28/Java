package StringManipulation;

public class Path {
    private String disk, extension, fileName, path;
    StringBuilder folders = new StringBuilder();

    public Path() {
    }

    public String getFileName() {

        return fileName.substring(0, fileName.indexOf('.'));
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getDisk() {
        return disk;
    }

    public String getExtension() {
        extension = fileName.substring(fileName.indexOf('.') + 1);
        return extension;
    }

    public void setFolders(String[] strArr) {
        if (strArr.length > 2) {
            folders.append(strArr[1]);
            for (int i = 2; i < strArr.length - 1; i++) {
                folders.append(" ").append(strArr[i]);
            }
        } else {
            folders.append("File not stored in folder");
        }
    }

    public String getFolders() {
        return "[" + folders + "]";
    }

    public void setPath(String path) {
        this.path = path.substring(0, path.lastIndexOf('\\'));
    }

    public String getPath() {
        return this.path;
    }
}
