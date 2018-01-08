# PreventRelicPlacement
Prevents the placement of Relic items.  For Maestrea.

This plugin simply checks whether an item in hand during a block place event has lore.  If so, it checks if the lore contains the standard Relic text.  If so, it cancels the place event.
