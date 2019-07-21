import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("eu")
@Implements("Wrapper")
public abstract class Wrapper extends DualNode {
   @ObfuscatedName("f")
   @Export("size")
   final int size;

   Wrapper(int var1) {
      this.size = var1;
   }

   @ObfuscatedName("m")
   @Export("get")
   abstract Object get();

   @ObfuscatedName("f")
   @Export("isSoft")
   abstract boolean isSoft();
}
