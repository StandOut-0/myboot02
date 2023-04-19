package com.myboot02.common.tiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration//설정 클래스로 지정한다.
public class TilesConfig{
	
	@Bean//id가 tilesConfigurer인 빈을 생성한다.
	public TilesConfigurer tilesConfigurer() {
		final TilesConfigurer configurer = new TilesConfigurer();
		configurer.setDefinitions(new String[] {"WEB-INF/tiles/tiles_member.xml"});
		//configurer.setDefinitions(new String[] {"WEB-INF/tiles/tiles_member.xml","WEB-INF/tiles/tiles_board.xml"});
		configurer.setCheckRefresh(true);
		return configurer;
	}
	@Bean
	public TilesViewResolver tilesViewResolver() {
		final TilesViewResolver resolver = new TilesViewResolver();
		resolver.setViewClass(TilesView.class);
		return resolver;
	}
}
