/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 19 18:47:44 GMT 2017
 */

package dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dominion.Card;
import dominion.Game;
import dominion.Player;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player("");
      Card[] cardArray0 = new Card[3];
      Card card0 = new Card(9);
      cardArray0[0] = card0;
      player0.hand = cardArray0;
      MockRandom mockRandom0 = new MockRandom();
      Player player1 = new Player("");
      Game game0 = new Game();
      boolean boolean0 = player0.play_action(0, mockRandom0, player1, game0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player("");
      Card[] cardArray0 = new Card[3];
      Card card0 = new Card(9);
      cardArray0[0] = card0;
      cardArray0[1] = card0;
      player0.hand = cardArray0;
      MockRandom mockRandom0 = new MockRandom();
      int int0 = player0.buy(cardArray0[1]);
      assertEquals(0, int0);
      
      Game game0 = new Game();
      boolean boolean0 = player0.play_action(0, mockRandom0, player0, game0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player("");
      Card[] cardArray0 = new Card[3];
      Card card0 = new Card(9);
      cardArray0[0] = card0;
      player0.hand = cardArray0;
      player0.played_value = 9;
      MockRandom mockRandom0 = new MockRandom();
      Game game0 = new Game();
      boolean boolean0 = player0.play_action(0, mockRandom0, player0, game0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player("");
      Card[] cardArray0 = new Card[3];
      Card card0 = new Card(9);
      cardArray0[0] = card0;
      cardArray0[1] = cardArray0[0];
      player0.hand = cardArray0;
      MockRandom mockRandom0 = new MockRandom();
      player0.count_ac();
      Game game0 = new Game();
      boolean boolean0 = player0.play_action(0, mockRandom0, player0, game0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player(")B4w^67a;9C.cBy");
      MockRandom mockRandom0 = new MockRandom((long) 3);
      Game game0 = new Game();
      // Undeclared exception!
      try { 
        player0.play_action(3, mockRandom0, player0, game0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player("");
      Card[] cardArray0 = new Card[3];
      player0.buy_turns = 4;
      // Undeclared exception!
      try { 
        player0.buy(cardArray0[0]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player("f4bJ(2P;AoMu_");
      Card[] cardArray0 = new Card[6];
      Card card0 = new Card(1);
      cardArray0[0] = card0;
      cardArray0[1] = cardArray0[0];
      cardArray0[2] = cardArray0[1];
      Card card1 = new Card();
      cardArray0[3] = card1;
      card1.value = 1;
      player0.hand = cardArray0;
      // Undeclared exception!
      try { 
        player0.play_all_treasure();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player("");
      Card[] cardArray0 = new Card[3];
      Card card0 = new Card(9);
      cardArray0[0] = card0;
      player0.hand = cardArray0;
      player0.buy_turns = 4;
      // Undeclared exception!
      try { 
        player0.count_ac();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player("");
      player0.draw(9);
      player0.count_ac();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player("");
      Card[] cardArray0 = new Card[3];
      Card card0 = new Card(9);
      cardArray0[0] = card0;
      cardArray0[2] = cardArray0[0];
      Card[] cardArray1 = new Card[6];
      player0.deck = cardArray1;
      player0.buy(cardArray0[2]);
      player0.draw(7);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player("");
      MockRandom mockRandom0 = new MockRandom();
      mockRandom0.nextDouble();
      player0.shuffle(mockRandom0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player("");
      Card[] cardArray0 = player0.hand;
      player0.deck = cardArray0;
      MockRandom mockRandom0 = new MockRandom();
      player0.shuffle(mockRandom0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player("Festival");
      Card[] cardArray0 = new Card[6];
      player0.hand = cardArray0;
      player0.to_limbo(2);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player("Festival");
      Card[] cardArray0 = new Card[6];
      player0.hand = cardArray0;
      player0.to_deck(2);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player("f4bJ(2P;AoMu_");
      Card[] cardArray0 = new Card[6];
      player0.hand = cardArray0;
      player0.discard(1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player("_$4UD<skPO\"A;lL");
      Card[] cardArray0 = new Card[1];
      Card[] cardArray1 = player0.remove(cardArray0, 0);
      assertNotSame(cardArray1, cardArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Card[] cardArray0 = new Card[1];
      Card card0 = new Card();
      Card[] cardArray1 = Player.append(cardArray0, card0);
      assertNotSame(cardArray0, cardArray1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player("2s\"_s0G%D");
      // Undeclared exception!
      try { 
        player0.shuffle((Random) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Player player0 = new Player("?&QJpDF=?]");
      // Undeclared exception!
      try { 
        player0.remove((Card[]) null, 9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player("");
      Card[] cardArray0 = new Card[4];
      // Undeclared exception!
      try { 
        player0.remove(cardArray0, 324);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 324, Size: 4
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player("Name: ");
      Card[] cardArray0 = new Card[7];
      // Undeclared exception!
      try { 
        player0.remove(cardArray0, (-1327));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Player player0 = new Player("\tPlays ");
      player0.hand = null;
      // Undeclared exception!
      try { 
        player0.putback();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Player player0 = new Player("M<u*!jk");
      player0.hand = null;
      Game game0 = new Game();
      // Undeclared exception!
      try { 
        player0.play_action(0, (Random) null, player0, game0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Player player0 = new Player(")B4w^67a;9C.cBy");
      player0.deck = null;
      // Undeclared exception!
      try { 
        player0.draw(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Player player0 = new Player("victory");
      // Undeclared exception!
      try { 
        player0.draw((-171));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Player player0 = new Player("sf5");
      player0.hand = null;
      // Undeclared exception!
      try { 
        player0.discard(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Player player0 = new Player("if");
      // Undeclared exception!
      try { 
        player0.discard((-2213));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Card card0 = new Card(0);
      // Undeclared exception!
      try { 
        Player.append((Card[]) null, card0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Player player0 = new Player("7gH&jic#1QSqoI)dt");
      Card[] cardArray0 = new Card[3];
      Card[] cardArray1 = player0.remove(cardArray0, 0);
      assertNotSame(cardArray1, cardArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Player player0 = new Player(")B4w^67a;9C.cBy");
      player0.draw(4);
      MockRandom mockRandom0 = new MockRandom(1L);
      Game game0 = new Game();
      boolean boolean0 = player0.play_action(0, mockRandom0, player0, game0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Player player0 = new Player((String) null);
      Card card0 = new Card(0);
      int int0 = player0.buy(card0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Player player0 = new Player("");
      player0.play_all_treasure();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Player player0 = new Player((String) null);
      Card[] cardArray0 = new Card[3];
      player0.limbo = cardArray0;
      player0.putback();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Player player0 = new Player("Festival");
      Card[] cardArray0 = new Card[6];
      player0.hand = cardArray0;
      player0.putback();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Player player0 = new Player("");
      player0.count_ac();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Player player0 = new Player("");
      player0.draw(2028);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Player player0 = new Player("S1PlA");
      // Undeclared exception!
      try { 
        player0.to_limbo((-1504));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1504
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Player player0 = new Player("");
      // Undeclared exception!
      try { 
        player0.to_deck(1400);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1400
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Player player0 = new Player("sf5");
      // Undeclared exception!
      try { 
        player0.discard(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }
}