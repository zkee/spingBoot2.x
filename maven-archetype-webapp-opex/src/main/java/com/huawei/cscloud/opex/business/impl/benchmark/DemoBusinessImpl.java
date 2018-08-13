package com.huawei.cscloud.opex.business.impl.benchmark;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.huawei.cscloud.opex.business.benchmark.DemoBusiness;
import com.huawei.cscloud.opex.mapper.benchmark.DemoMapper;

@Service("demoBusiness")
public class DemoBusinessImpl implements DemoBusiness {
	@Resource
	private DemoMapper demoMapper;
}
