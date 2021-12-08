package com.atck.admin.actuator.info;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.Collections;
@Component
public class AppInfoContributor implements InfoContributor
{
    @Override
    public void contribute(Info.Builder builder)
    {
        builder.withDetail("msg","你好");
        builder.withDetail("hello","atck");
        builder.withDetails(Collections.singletonMap("world","66666"));
    }
}
