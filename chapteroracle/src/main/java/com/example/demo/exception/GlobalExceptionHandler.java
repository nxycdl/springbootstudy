package com.example.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017-11-25.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 创建一个错误页面;
     * public static final String DEFAULT_ERROR_VIEW = "error";
     *
     * @ExceptionHandler(value = Exception.class)
     * public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
     * ModelAndView mav = new ModelAndView();
     * mav.addObject("exception", e);
     * mav.addObject("url", req.getRequestURL());
     * mav.setViewName(DEFAULT_ERROR_VIEW);
     * return mav;
     * }
     */

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ErrorInfo<String> jsonErrorHandler(HttpServletRequest req, Exception e) throws Exception {

        ErrorInfo<String> r = new ErrorInfo<>();
        r.setMessage(e.getMessage());
        r.setCode(ErrorInfo.ERROR);
        r.setData("{}");
        r.setUrl(req.getRequestURL().toString());
        e.printStackTrace();
        return r;
    }


}
