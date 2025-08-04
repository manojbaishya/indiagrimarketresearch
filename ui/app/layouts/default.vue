<template>
    <div id="app-layout">
        <div id="app-header">
            <img src="/favicon.ico" alt="logo">
            <AppHeader :links="navigationData" />
        </div>
        <div id="app-content">
            <slot />
        </div>
        <div id="app-footer">
            <AppFooter />
        </div>
    </div>
</template>

<script lang="ts" setup>
import { navigationData } from '@/utils/navigation';
</script>


<style lang="scss" scoped>
$header-height: 60px;
$footer-height: 40px;

#app-layout {
    display: flex;
    flex-direction: column;
    height: 100vh;
    overflow: hidden;
}

#app-header {
    height: $header-height;
    flex-shrink: 0;

    display: flex;
    align-items: center;
    justify-content: space-between;
    border-color: hsl(0, 2%, 75%);
    border-style: solid;
    border-bottom-width: 1px;
}

#app-footer {
    height: $footer-height;
    flex-shrink: 0;
}

#app-content {
    flex: 1 1 auto;
    overflow: auto;
}
</style>