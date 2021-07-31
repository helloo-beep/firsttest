package pojo;

import org.springframework.web.multipart.MultipartFile;

public class FileDomain {
    private String description;
    private MultipartFile myfile;

    public FileDomain() {
    }

    public FileDomain(String description, MultipartFile myfile) {
        this.description = description;
        this.myfile = myfile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public  MultipartFile getMyfile() {
        return myfile;
    }

    public void setMyfile(MultipartFile myfile) {
        this.myfile = myfile;
    }

    @Override
    public String toString() {
        return "FileDomain{" +
                "description='" + description + '\'' +
                ", myfile=" + myfile +
                '}';
    }
}
