package com.whackon.witmed.base.exception;

import com.whackon.witmed.base.pojo.vo.ResponseVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import sun.applet.Main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * <b></b>
 *
 * @author mi
 * @date 2021/12/30
 * @since
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
	// 创建日志对象
	private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	/**
	 * <b>处理项目所抛出的异常信息</b>
	 * @param exception
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	public ResponseVO globaleExceptionHandle(Exception exception) {
		// 将异常信息记录到日志中
		logger.error(exception.getMessage() + " : " + new Date(), exception);
		// 返回前端异常响应视图
		return ResponseVO.exception(exception);
	}
}
