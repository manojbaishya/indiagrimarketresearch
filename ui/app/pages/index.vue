<script setup lang="ts">

</script>

<template>
    <div id="homepage">
        <div id="search-label"><h1 class="text-5xl">Commodity Search</h1></div>
        <SearchBar placeholder="Search for a commodity..." />
    </div>
</template>

<style lang="scss" scoped>
#homepage {
  flex: 1 1 0;
  min-width: 0;
  min-height: 0;

  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;

  #search-label {
      margin: 1rem;
  }
}
</style>
