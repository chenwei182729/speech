package com.cninfo.controller;

import com.cninfo.dao.VoiceInfoMapper;
import com.cninfo.model.VoiceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
   private VoiceInfoMapper voiceInfoMapper;

    @ResponseBody
    @GetMapping("all")
    public List<VoiceInfo> queryAll() {
        return voiceInfoMapper.selectAll();
    }

    @ResponseBody
    @GetMapping("text/{textId}")
    public VoiceInfo queryByTextId(@RequestParam(defaultValue = "0") @PathVariable("textId") Long textId) {
        return voiceInfoMapper.selectByPrimaryKey(textId);
    }
//
//    @ResponseBody
//    @GetMapping("voice/{voiceId}")
//    public VoiceInfo queryByVoiceId(@RequestParam(defaultValue = "0") @PathVariable("voiceId") Long textId) {
//        return voiceInfoService.qieruByTextId(textId);
//    }

}
