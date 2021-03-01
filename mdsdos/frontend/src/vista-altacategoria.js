import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaAltacategoria extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct);"></vaadin-horizontal-layout>
 <vaadin-vertical-layout class="content" style="width: 100%; flex-grow: 1; flex-shrink: 1; flex-basis: auto;">
  <vaadin-vertical-layout theme="spacing" style="width: 50%; flex-grow: 0; flex-shrink: 0; align-self: center; padding: var(--lumo-space-xl); height: 25%;"></vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 50%; flex-grow: 0; flex-shrink: 0; align-self: center; padding: var(--lumo-space-l); height: 50%; border: solid;">
   <label style="font-weight: bold; flex-grow: 0; align-self: stretch;">Introduzca el nombre de la nueva categoría:</label>
   <span style="width: 70%; align-self: center; height: 20%;">.</span>
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; height: 100%; width: 100%;"></vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; height: 100%; width: 100%; flex-shrink: 1; align-self: center;">
    <vaadin-button style="align-self: flex-end; width: 100%;">
      Aceptar 
    </vaadin-button>
    <vaadin-button style="align-self: flex-end; width: 100%;">
     Cancelar 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 50%; flex-grow: 0; flex-shrink: 0; align-self: center; padding: var(--lumo-space-xl); height: 25%;"></vaadin-vertical-layout>
  <vaadin-horizontal-layout class="footer" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct);"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-altacategoria';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAltacategoria.is, VistaAltacategoria);
