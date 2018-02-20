package com.bs.web.config.security;

import com.alibaba.fastjson.JSON;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by xianyang on 2018/2/20.
 */
public class Http401UnauthorizedEntryPoint implements AuthenticationEntryPoint {

    /**
     * Always returns a 401 error code to the client.
     */
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException arg) throws IOException, ServletException {
        if(!StringUtils.isEmpty(request.getHeader("x-requested-with"))){
            Map<String, Object> result = new LinkedHashMap<>();
            result.put("success", true);

            response.getWriter().print(JSON.toJSONString(result));
            response.getWriter().flush();
        }else{
            response.sendRedirect("/user/login");
        }
    }
}
