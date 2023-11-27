package com.app.junit;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@SuppressWarnings("deprecation")
@RunWith(JUnitPlatform.class)
@SelectClasses({ Assignment.IncludeExcludeTags.class })
//@IncludeTags({"Prod"})
@ExcludeTags("Prod")

public class Junit5Runner {

}
