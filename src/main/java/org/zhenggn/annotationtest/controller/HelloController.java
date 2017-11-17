package org.zhenggn.annotationtest.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>Title: SpringMVCTest</p>
 * <p>Description: 控制器</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: www.jd.com</p>
 *
 * @author zhengguinan
 * @version 1.0
 * @date 2017/11/17
 */
@Controller
public class HelloController {

    private static final Log logger = LogFactory.getLog(HelloController.class);

    @RequestMapping(value = "/hello")
    public ModelAndView hello() {
        logger.info("handleRequest 被调用");
        ModelAndView mv = new ModelAndView();
        mv.addObject("message","Hello World!");
        mv.setViewName("/WEB-INF/content/welcome.jsp");
        return mv;
    }
}
