package com.lcx.springtest;/**
 * Created by lichenxiang on 2018/8/23.
 */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * <p>  </p>
 *
 * @author lichenxiang
 * @version TestSuit: TestSuit.java, v 0.1 2018年08月23日 下午6:45:45 lichenxiang Exp $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        ApplicationContextTestV2.class,
        SpringTestV1.class })
public class TestSuit {


}