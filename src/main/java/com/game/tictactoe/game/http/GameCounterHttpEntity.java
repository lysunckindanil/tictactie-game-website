package com.game.tictactoe.game.http;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JacksonXmlRootElement
public class GameCounterHttpEntity {
    int counter;
}
