package com.magic.magiccodesandbox;

import com.magic.magiccodesandbox.model.ExecuteCodeRequest;
import com.magic.magiccodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {
    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
