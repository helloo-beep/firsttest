package controller;

import com.sun.tracing.dtrace.Attributes;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.FileDomain;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
@Controller
public class FileUploadController {
    private  static final Log logger= LogFactory.getLog(FileUploadController.class);
   @RequestMapping("/onefile")
    public String oneFileUpload(@ModelAttribute FileDomain fileDomain, HttpServletRequest request){
        String realpath=request.getServletContext().getRealPath("uploadfiles");
        String fileName=fileDomain.getMyfile().getOriginalFilename();
        File targetFile=new File(realpath,fileName);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        try{
            fileDomain.getMyfile().transferTo(targetFile);
            logger.info("success...");
        }catch (IOException e){
            e.printStackTrace();
        }
        return "showone";
    }
}
