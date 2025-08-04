<script setup lang="ts">
import { Search } from "lucide-vue-next";

defineProps<{ placeholder: string }>()
</script>

<template>
  <div class="relative w-full max-w-2xl items-center">
    <Input id="search" type="text" :placeholder="placeholder" class="h-16 pl-16 !text-2xl" />
    <span class="absolute start-0 inset-y-0 flex items-center justify-center px-4">
      <Search class="size-10 text-muted-foreground" />
    </span>
  </div>
</template>
