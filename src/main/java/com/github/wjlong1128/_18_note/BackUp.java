package com.github.wjlong1128._18_note;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author wjlong1128
 * @version 1.0
 * @date 2023/8/23
 * @desc
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BackUp implements Memento{
    private String context;
}