package me.chanjar.weixin.cp.bean;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * 群聊
 *
 * @author gaigeshen
 */
@Data
public class WxCpChat implements Serializable {
  private static final long serialVersionUID = -4301684507150486556L;
  
  private String id;
  private String name;
  private String owner;
  private List<String> users;

}
