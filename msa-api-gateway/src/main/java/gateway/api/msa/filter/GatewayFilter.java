package gateway.api.msa.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

public class GatewayFilter extends ZuulFilter {
    private static Logger logger = LoggerFactory.getLogger(GatewayFilter.class);

    @Override
    public String filterType() {
        return "pre"; // "post", "routing", "error"
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        logger.info(String.format("%s >>>>  request to >>>> %s", request.getMethod(), request.getRequestURL().toString()));
        return null;
    }
}
