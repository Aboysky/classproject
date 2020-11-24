package cn.edu.sicnu.cs.exception;

import cn.edu.sicnu.cs.constant.GlobalCons;
import cn.edu.sicnu.cs.constant.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 通用异常处理类
 *
 * @author xiazichao
 */
public class CommonExceptionResolver implements HandlerExceptionResolver {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
                                         Exception ex) {
        if (ex instanceof CommonException) {
            logger.error("CommonException for {}", ex);
            ModelAndView mav = new ModelAndView(new MappingJackson2JsonView());
            mav.addObject(GlobalCons.CODE, ((CommonException) ex).getExceptionCode());
            mav.addObject(GlobalCons.MSG, ((CommonException) ex).getMessage());
            response.setStatus(((CommonException) ex).getExceptionCode());
            return mav;
        } else {
            logger.error("Internal Server Error for {}", ex);
            ModelAndView mav = new ModelAndView(new MappingJackson2JsonView());
            mav.addObject(GlobalCons.CODE, ResultCode.INTERNAL_SERVER_ERROR);
            mav.addObject(GlobalCons.MSG, ex.getMessage());
            response.setStatus(ResultCode.INTERNAL_SERVER_ERROR);
            return mav;
        }
    }
}
