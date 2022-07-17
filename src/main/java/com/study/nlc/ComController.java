package com.study.nlc;

import com.study.nlc.test.Test;
import com.study.nlc.test.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Controller
public class ComController {

    @Autowired
    TestRepository tr;

    @RequestMapping(value="/")
    public String nlcHome() {
        return "nlc";
    }

    @RequestMapping(value="/home")
    public String home(HttpServletRequest rq) {
        return "home";
    }

    @RequestMapping(value="/search")
    public String search (HttpServletRequest rq) {
        String test_id = rq.getParameter("test_id");
        Optional<Test> testPrint = tr.findById(test_id);
        rq.setAttribute("test_id",testPrint.get().getId());
        rq.setAttribute("test_etc",testPrint.get().getEtc());
        return "home";
    }
}
