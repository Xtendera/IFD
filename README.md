# IFD
This plugin allows you to enable the item frame dupe (IFD) on your server. The plugin is based on SweetAnarchy's IFD plugin.

This plugin has only been tested with paper, but bukkit and maybe spigot support might be coming later.

## Options

The only options right now are `dupeEnabled` and `dupeChance`. They can be modified through the config.yml file located in the plugins -> IFD folder. `dupeEnabled` controls if the dupe works at all, and `dupeChance` sets the percentage of the time this dupe will work. `dupeChance` **HAS** to be a number between 0 and 100. You can effectivly disable the dupe by setting `dupeChance` to 0, but changing `dupeEnabled` is more resource efficiant because it doesn't load the dupe class into memory.

By defualt, `dupeEnabled` is set to true and `dupeChance` is set to 5 (which is the dupe rate on SweetAnarchy most of the time).
