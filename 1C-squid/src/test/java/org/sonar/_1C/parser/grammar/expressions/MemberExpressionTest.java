/*
 * Sonar 1С Plugin
 * Copyright (C) 2017 Vasiliy Kazmin and SonarSource
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar._1C.parser.grammar.expressions;

import org.junit.Test;
import org.sonar._1C.parser._1СGrammar;
import org.sonar.sslr.parser.LexerlessGrammar;

import static org.sonar.sslr.tests.Assertions.assertThat;

public class MemberExpressionTest {

  LexerlessGrammar g = _1СGrammar.createGrammar();

  @Test
  public void ok() {
    assertThat(g.rule(_1СGrammar.LEFT_HAND_SIDE_EXPRESSION))
        .matches("primaryExpression")
        .matches("primaryExpression [ expression ]")
        .matches("primaryExpression . identifierName")
        .matches("primaryExpression [ expression ] . identifierName");
  }

}
