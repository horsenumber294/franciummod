# Francium Mod

A 1.7.10 Forge addon for HBM's Nuclear Tech Mod adding PTCFC polymer materials
and other advanced compounds.

---

## First-Time Setup (one time only)

The `gradle-wrapper.jar` is not included due to file size. You need to add it
once before the GitHub Actions build will work.

**Option A — If you have Gradle installed locally:**
```
gradle wrapper --gradle-version 2.14
```
Run this in the project root. It generates `gradle/wrapper/gradle-wrapper.jar`
automatically. Commit the result.

**Option B — Download manually:**
1. Download from: https://services.gradle.org/distributions/gradle-2.14-bin.zip
2. Extract it
3. Copy `gradle-2.14/lib/gradle-wrapper.jar` into `gradle/wrapper/gradle-wrapper.jar`
4. Commit the file

---

## Building

### Via GitHub Actions (recommended — no local setup needed)
1. Push this repo to GitHub
2. Go to the **Actions** tab
3. Watch the build run automatically
4. When it finishes: click the run → **Artifacts** → download **franciummod-jar**
5. Drop the `.jar` into MultiMC's mods folder

### Locally (if you have Java 8 + Gradle set up)
```
./gradlew setupCiWorkspace
./gradlew build
```
Output jar: `build/libs/franciummod-1.0.0.jar`

---

## Adding New Items

1. Open `src/main/java/com/franciummod/items/ModItems.java`
2. Add one line:
   ```java
   public static Item myNewItem = new ItemBase("my_new_item", "My New Item");
   ```
3. Add it to the `ALL_ITEMS` array in the same file
4. Add a renderer line in `ClientProxy.java`:
   ```java
   registerItemModel(ModItems.myNewItem, "my_new_item");
   ```
5. Add a lang entry in `assets/franciummod/lang/en_US.lang`:
   ```
   item.franciummod.my_new_item.name=My New Item
   ```
6. Drop a 16x16 PNG at `assets/franciummod/textures/items/my_new_item.png`
7. Push → GitHub Actions builds the new jar automatically

## Adding New Blocks

Same process but in `ModBlocks.java` using `BlockBase` instead of `ItemBase`.
Lang key prefix is `tile.` instead of `item.`
Texture goes in `textures/blocks/` instead of `textures/items/`

---

## Project Structure

```
franciummod/
├── .github/workflows/build.yml   ← auto-build on every push
├── build.gradle                  ← Forge build config
├── gradle.properties             ← version numbers
├── gradlew                       ← build script
└── src/main/
    ├── java/com/franciummod/
    │   ├── FranciumMod.java       ← @Mod entry point + creative tab
    │   ├── items/
    │   │   ├── ItemBase.java      ← reusable base class
    │   │   └── ModItems.java      ← ALL item declarations here
    │   ├── blocks/
    │   │   ├── BlockBase.java     ← reusable base class
    │   │   └── ModBlocks.java     ← ALL block declarations here
    │   └── proxy/
    │       ├── CommonProxy.java
    │       └── ClientProxy.java   ← renderer registration
    └── resources/assets/franciummod/
        ├── lang/en_US.lang        ← display names
        └── textures/
            ├── items/             ← item PNGs (replace placeholders)
            └── blocks/            ← block PNGs (replace placeholders)
```
